package com.tie.algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리_순회_레벨탐색 {

    static Queue<Node> Q = new LinkedList<>();

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.lt = new Node(2);
        tree.rt = new Node(3);
        tree.lt.lt = new Node(4);
        tree.lt.rt = new Node(5);
        tree.rt.lt = new Node(6);
        tree.rt.rt = new Node(7);
        bfs(tree);
    }

    static void bfs(Node root) {
        Q.offer(root);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");

            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");

                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }

                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

}