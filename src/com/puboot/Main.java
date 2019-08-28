package com.puboot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Tree rootTree = new Tree(1, "一");
        Tree secondTreeOne = new Tree(2, "二");
        Tree secondTreeTwo = new Tree(3, "三");
        Tree thirdTreeOne = new Tree(4, "四");
        Tree thirdTreeTwo = new Tree(5, "五");
        rootTree.children = Arrays.asList(secondTreeOne, secondTreeTwo);
        secondTreeTwo.children = Arrays.asList(thirdTreeOne, thirdTreeTwo);
        List<Tree> testRes = Collections.singletonList(rootTree);
        Integer searchNodeId = 4;
        Tree searchNode = search(testRes, searchNodeId);
        System.out.println(searchNode == null ? "null" : searchNode.name);

    }

    private static Tree search(List<Tree> treeNode, Integer searchNodeId) {
        if (treeNode == null || treeNode.isEmpty()) {
            return null;
        }
        return treeNode.stream().filter(tree -> searchNodeId.equals(tree.id))
                .findFirst().orElseGet(() -> {
                    Tree t;
                    for (Tree tree : treeNode) {
                        t = search(tree.children, searchNodeId);
                        if (t != null) {
                            return t;
                        }
                    }
                    return null;
                });
    }

    static class Tree {
        Integer id;
        String name;
        List<Tree> children;

        public Tree(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
