public class Week11{
  public static Node buildTree(Object[]a,int i){
    if(i<=a.length-1 && a[i]!=null){
      return new Node(a[i],buildTree(a,2*i),buildTree(a,2*i+1));
    }else{
      return null;
    }
  }
  public static void printInOrder(Node root){
    if(root==null){}
    else{
      printInOrder(root.left);
      System.out.println(root.val);
      printInOrder(root.right);
    }
  }
  public static void printPreOrder(Node root){
    if(root==null){
    }
    else{
      System.out.println(root.val);
      printPreOrder(root.left);
      printPreOrder(root.right);
    }
    }
  public static void printPostOrder(Node root){
    if(root==null){}
    else{
    printPostOrder(root.left);
    printPostOrder(root.right);
    System.out.println(root.val);
    }
  }
  public static int height(Node root){
    if(root==null){
     return -1;
    } else{
      return 1+Math.max(height(root.left),height(root.right));
    }
  }
  public static int level(Node root,int key,int level){
    if(root==null){
    return -1;
    }
    else if((Integer)(root.val)==key){
      return level;
  }
    else{
     int result=level(root.left,key,level+1);
     if(result!=-1){// If found in left subtree , return
      return result;
     }
     result=level(root.right,key,level+1);//if not,search right subtree
     return result;
    }
  }
  public static boolean same(Node n1,Node n2){
    if(n1==null || n2==null){
      if(n1==null && n2==null){
       return true;
      }else{
       return false;
      }
    }
    else{
     return (n1==n2 && same(n1.left,n2.left) && same(n1.right,n2.right));  
    }
    
  }
  
  public static Node copy(Node root){
    if(root==null){
     return null;
    }else{
     return new Node(root.val,copy(root.left),copy(root.right));
    }
    
  }
  
    
  public static void main(String[]args){
    Object[]array={null,50,25,75,10,30,60,90,-5,null,29,null,
      55,70,null,null,null,9,null,null,27,null,null,null,52,57};


    Node root=buildTree(array,1);
    System.out.println(level(root,30,0));
    System.out.println("///");
    printInOrder(root);
    System.out.println("///");
    System.out.println(height(root));
    System.out.println("///");
    printPreOrder(root);
    System.out.println("///");
    printPostOrder(root);
    System.out.println("///");
    printInOrder(copy(root));
  }
}