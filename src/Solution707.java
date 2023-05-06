public class Solution707 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(7);
        list.show();
        list.addAtHead(2);
        list.show();
        list.addAtHead(1);
        list.show();
        list.addAtIndex(3,0);
        list.show();
        list.deleteAtIndex(2);
        list.show();
        list.addAtHead(6);
        list.show();
        list.addAtTail(4);
        list.show();
        int i=list.get(4);
        list.show();
        System.out.println(i);
        list.addAtHead(4);
        list.show();
        list.addAtIndex(5,0);
        list.show();
        list.addAtHead(6);
        list.show();
    }
}
class MyLinkedList {

    // private static boolean isInitialized=false;
    private static MyLinkedList lastNode;
    private static MyLinkedList firstNode;
    private static int totalNode=0;
    public int val;
    public MyLinkedList next;
    MyLinkedList pre;

    public MyLinkedList() {

    }

    public int get(int index) {
        if(totalNode==0||index<0||index>=totalNode){
            return -1;
        }
        int mid=totalNode/2;
        if(index<mid){
            MyLinkedList node=firstNode;
            while(index>=0){
                if(index==0){
                    return node.val;
                }
                node=node.next;
                index--;
            }
        }
        // 1 5 3 6
        // 0 1 2 3
        index=totalNode-index-1;
        MyLinkedList node=lastNode;
        while(index>=0){
            if(index==0){
                return node.val;
            }
            node=node.pre;
            index--;
        }
        return -1;
    }

    public void addAtHead(int val) {
        if(totalNode==0){
            this.val=val;
            firstNode=this;
            lastNode=this;
            totalNode++;
            return;
        }
        MyLinkedList newNode=new MyLinkedList();
        newNode.val=val;
        newNode.next=firstNode;
        firstNode.pre=newNode;
        firstNode=newNode;
        totalNode++;
    }

    public void addAtTail(int val) {
        if(totalNode==0){
            this.val=val;
            firstNode=this;
            lastNode=this;
            totalNode++;
            return;
        }
        MyLinkedList newNode=new MyLinkedList();

        newNode.val=val;
        lastNode.next=newNode;
        newNode.pre=lastNode;
        lastNode=newNode;
        totalNode++;
    }

    public void addAtIndex(int index, int val) {
        if(index<0||index>totalNode){
            return;
        }

        if(index==0){
            addAtHead(val);
            return;
        }

        if(index==totalNode){
            addAtTail(val);
            return;
        }
        MyLinkedList node=firstNode;
        while(index>=0){
            if(index==0){
                MyLinkedList newNode=new MyLinkedList();
                newNode.val=val;
                node.pre.next=newNode;
                newNode.pre=node.pre;
                newNode.next=node;
                node.pre=newNode;
            }
            node=node.next;
            index--;
        }
        totalNode++;
    }

    public void deleteAtIndex(int index) {
        if(index<0||index>totalNode){
            return;
        }
        if(index==0){
            firstNode=firstNode.next;
            firstNode.pre=null;
            totalNode--;
            return ;
        }
        if(index==totalNode-1){
            lastNode=lastNode.pre;
            lastNode.next=null;
            totalNode--;
            return;
        }
        MyLinkedList node=firstNode;
        while(index>=0){
            if(index==0){
                node.pre.next=node.next;
                node.next.pre=node.pre;
                totalNode--;
                return;
            }
            node=node.next;
            index--;
        }

    }

    public void show(){
        MyLinkedList node=firstNode;
        while (node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();
        System.out.println("********************");
    }
}