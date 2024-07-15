import java.util.ArrayList;

public class ThreeColorCode {
    static ArrayList<Node> list=new ArrayList<>();
    public static void add(Node node,Node prev,Node next){
        list.add(node);

        if(prev!=null){
            node.prev=prev;
            prev.next=node;
        }
        if(next!=null){
            node.next=next;
        }
    }
    public  static ArrayList<Node> remark(ArrayList<Node> list){
        for (Node node:list){
            if(node.color==Color.Black&&node.next!=null&&node.next.color==Color.White){
                node.next.color=Color.Black;
            }
        }
        return list;
    }
    public static ArrayList<Node> mark1(ArrayList<Node> list){
        if(!list.isEmpty()){
            ArrayList<Node> list1=new ArrayList<>();
            for(Node node:list) {
                node = mark2(node);
                list1.add(node);
            }
            return list1;
        }else {
            return null;
        }
    }
    public static Node mark2(Node node){
        if(node.prev!=null){
            if(node.prev.color==Color.Gray&&node.color==Color.White){
                node.prev.color=Color.Black;
                if(node.next!=null){
                    node.color=Color.Gray;
                }else{
                    node.color=Color.Black;
                }
            }
        }
        if (node.next!=null){
        node.color=Color.Gray;
        }
        return node;
    }
    public static void main(String[] args) {
        Node a=new Node();
        Node b=new Node();
        Node c=new Node();
        Node d=new Node();
        Node e=new Node();
        add(a,null,b);
        add(b,a,d);
        add(c,null,null);
        add(d,b,e);
        add(e,d,null);
       list=mark1(list);
       if(list!=null){
           for (Node node:list){
               System.out.println(node.color);
           }
       }
       Node f=new Node();
       add(f,e,null);
       remark(list);
        if(list!=null){
            for (Node node:list){
                System.out.println(node.color);
            }
        }
    }
}
class Node{
    public Color color;
    Node next;
    Node prev;
    public Node(){
        color=Color.White;
        next=null;
        prev=null;
    }
}
enum Color{
    White,//白色
    Gray,//灰色
    Black//黑色
}
