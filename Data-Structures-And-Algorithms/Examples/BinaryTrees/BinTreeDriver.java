public class BinTreeDriver {

  public static void main(String [] args) {
    BinaryTree testTree =
      new BinaryTree(25,
           new BinaryTree(12,
                      new BinaryTree(9, BinaryTree.EMPTYTREE, BinaryTree.EMPTYTREE),
                      new BinaryTree(14, BinaryTree.EMPTYTREE, BinaryTree.EMPTYTREE)),
           new BinaryTree(36,
                      new BinaryTree(29, BinaryTree.EMPTYTREE, BinaryTree.EMPTYTREE),
                      BinaryTree.EMPTYTREE));
    System.out.println("\ntestTree inOrder:");
    testTree.printInOrder();

    BinaryTree newTree = testTree.insert(11);
    System.out.println("\nnewTree inOrder:");
    newTree.printInOrder();
    System.out.println("\ntestTree inOrder:");
    testTree.printInOrder();
    
    BinaryTree tree03 = 
      BinaryTree.EMPTYTREE.insert(34)
            .insert(48)
              .insert(29)
                .insert(36)
                  .insert(12)
                    .insert(9);
    System.out.println("\ntree03 preOrder:");
    tree03.printPreOrder();
    System.out.println("\ntree03 inOrder:");
    tree03.printInOrder();
    System.out.println("\ntree03 postOrder:");
    tree03.printPostOrder();
        
    BinaryTree tree04 
                = BinaryTree.EMPTYTREE.insert(34)
        .insert(48)
          .insert(59)
            .insert(66)
              .insert(112)
                .insert(900);
    System.out.println("\ntree04 preOrder:");
    tree04.printPreOrder();
    System.out.println("\ntree04 inOrder:");
    tree04.printInOrder();
    System.out.println("\ntree04 postOrder:");
    tree04.printPostOrder();
  }
}