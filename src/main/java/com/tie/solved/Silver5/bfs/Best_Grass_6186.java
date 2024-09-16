package com.tie.solved.Silver5.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 베시는 부드러운 봄 풀을 씹는 하루를 계획하고 있으며, 농부 존이 R(1 <= R <= 100) 행과 C(1 <= C <= 100) 열로 사랑스럽게 구획한 목초지를 바라보고 있습니다.
 * 그녀는 목초지에 있는 풀 덩어리의 수를 세고 싶어합니다.
 * <p>
 * 각 풀 덩어리는 지도에 단일 '#' 기호 또는 두 개의 '#' 기호가 나란히(대각선은 아님) 표시됩니다.
 * 두 개의 다른 덩어리를 나타내는 두 개의 기호가 인접하지 않습니다. 목초지 지도가 주어지면 Bessie에게 풀 덩어리가 몇 개 있는지 말하세요.
 * <p>
 * 예를 들어, R=5, C=6인 이 목초지 지도를 고려해 보겠습니다.
 * <p>
 * .#....
 * ..#...
 * ..#..#
 * ...##.
 * .#....
 * 이 목초지에는 총 5개의 덩어리가 있습니다.
 * 첫 번째 줄에 하나, 2열에서 2번째와 3번째 줄에 걸쳐 있는 덩어리, 세 번째 줄에 혼자 있는 덩어리, 4열에서 4번째와 5번째 줄에 걸쳐 있는 덩어리, 그리고 5열에 하나 더 있습니다.
 */
public class Best_Grass_6186 {

    static int R;
    static int C;
    static char[][] MAP;
    static boolean[][] VISITED;

    static int[] DX = {0, 1, 0, -1};
    static int[] DY = {1, 0, -1, 0};
    static int COUNT = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        MAP = new char[R][C];
        VISITED = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                MAP[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (MAP[i][j] == '#' && !VISITED[i][j]) {
                    bfs(i, j);
                    COUNT++;
                }
            }
        }

        System.out.println(COUNT);
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        VISITED[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int c_x = point.x;
            int c_y = point.y;

            for (int i = 0; i < 4; i++) {
                int nx = c_x + DX[i];
                int ny = c_y + DY[i];
                if (nx >= 0 && nx < R && ny >= 0 && ny < C && MAP[nx][ny] == '#' && !VISITED[nx][ny]) {
                    VISITED[nx][ny] = true;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}