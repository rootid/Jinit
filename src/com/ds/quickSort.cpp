#include<iostream>


//10 4 5 6 9 28 45

void mergeStep (int a[],int start,int mid,int end) {
    //start -> mid
    //mid -> end
    int aStart = start;
    int aEnd = mid;
    int bStart = mid + 1;
    int bEnd = end;
    int *b = new int[end - start + 1];
    while (aStart < aEnd && bStart < bEnd) {
        if (a[aStart] < a[bStart]) {
            b[idx] = a[aStart];
            aStart++;
        } else {
            b[idx] = a[bStart];
            bStart++;
        }
        idx++;
    }

    while (aStart < aEnd) {
        b[idx++] = a[aStart];
        aStart++;
    }
    while (bStart < bEnd) {
        b[idx++] = a[bStart];
        bStart++;
    }

}

void mergeSort (int a[],int start,int end) {
   
    if (start < end)  {
        int mid = start + (end - start) /2;
        mergeSort (a,start,mid);
        mergeSort (a,mid+1,end);
        mergeStep (a,start,mid,end);
    }
}


void quickSort () {

}

//1->2->3->NULL
//NULL<-1 (2->3->NULL)
Node* reverseLinkedListHelper(Node *head,Node *prev) {
    if (!head) {
        return prev;
    }
    Node *nxt = head->next;
    head->next = prev;
    reverseLinkedListHelper (nxt,head);
}


Node* reverseLinkedList (Node *head) {
    Node *prev = NULL;
    return  reverseLinkedListHelper (head,prev);
}


