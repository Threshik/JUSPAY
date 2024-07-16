/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    //Function to merge K sorted linked list.
    
    Node mergeKList(Node[]arr,int K)
    {
    //     //Add your code here.
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0;i<K;i++)
    {
        Node temp = arr[i];
        while(temp!=null)
        {
            pq.add(temp.data);
            temp=temp.next;
        }
    }
    Node t = new Node(-1);
    Node head=t;
    while(pq.size()!=0)
    {
        int t1 = pq.poll();
        head.next=new Node(t1);
        head=head.next;
        
    }
    return t.next;
    //   Node head = arr[0];
    //   for(int i=1;i<K;i++)
    //   {
    //       head=merging(head,arr[i]);
    //   }
    //   return head;
        
    // }
    // Node merging(Node head1,Node head2)
    // {
    //     Node t1 = head1;
    //     Node t2 = head2;
    //     Node dn = new Node(-1);
    //     Node temp = dn;
    //     while(t1!=null && t2!=null)
    //     {
    //         if(t1.data<t2.data)
    //         {
    //             temp.next=t1;
    //             temp=t1;
    //             t1=t1.next;
    //         }
    //         else
    //         {
    //             temp.next=t2;
    //             temp=t2;
    //             t2=t2.next;
    //         }
    //     }
    //         if(t1!=null)
    //         temp.next=t1;
    //         else
    //         temp.next=t2;
        
    //     return dn.next;
    }
}
