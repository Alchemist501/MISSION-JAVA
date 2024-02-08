//VINAYAK JAIMOHAN CU3_60
#include <stdio.h>
#include <stdlib.h>
#define MAX 5
typedef struct Element {
    int data;
    int priority;
} Element;
Element Q[MAX];
int front = -1, rear = -1;
void enqueue() {
    Element ele;
    if ((rear + 1) % MAX == front) {
        printf("Queue Full\n");
        return;
    }
    printf("Enter element to insert: ");
    scanf("%d", &ele.data);
    printf("Enter priority of the inserted element: ");
    scanf("%d", &ele.priority);
    if (front == -1 && rear == -1) {
        front = rear = 0;
        Q[rear] = ele;
    } else {
        rear = (rear + 1) % MAX;
        int i = rear;
        while (i != front && ele.priority < Q[(i - 1 + MAX) % MAX].priority) {
            Q[i] = Q[(i - 1 + MAX) % MAX];
            i = (i - 1 + MAX) % MAX;
        }
        Q[i] = ele;
    }
    printf("Element %d with priority %d was successfully inserted\n", ele.data, ele.priority);
}
void dequeue() {
    if (front == -1) {
        printf("Queue is Empty\n");
        return;
    }
    int del = front;
    if (front == rear) {
        front = rear = -1;
    } else {
        front = (front + 1) % MAX;
    }
    printf("Element %d with priority %d successfully deleted out of queue\n", Q[del].data, Q[del].priority);
}
void display() {
    if (front == -1) {
        printf("Queue is Empty\n");
    } else {
        printf("Queue Elements\n");
        int i = front;
        do {
            printf("Data: %d, Priority: %d\n", Q[i].data, Q[i].priority);
            i = (i + 1) % MAX;
        } while (i != (rear + 1) % MAX);
        printf("\n");
    }
}
int main() {
    int choice;
    printf("PRIORITY QUEUE OPERATIONS\n");
    printf("Enter:\n1 to insert\n2 to delete\n3 to print\n4 to exit\n");
    while (1) {
        printf("Enter choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                enqueue();
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                printf("Program Terminated\n");
                return 0;
            default:
                printf("Invalid Choice\n");
        }
    }
}
    OUTPUT 

PRIORITY QUEUE OPERATIONS
Enter:
1 to insert
2 to delete
3 to print
4 to exit
Enter choice: 1
Enter element to insert: 9
Enter priority of the inserted element: 9
Element 9 with priority 9 was successfully inserted
Enter choice: 1
Enter element to insert: 5
Enter priority of the inserted element: 6
Element 5 with priority 6 was successfully inserted
Enter choice: 1
Enter element to insert: 3
Enter priority of the inserted element: 7
Element 3 with priority 7 was successfully inserted
Enter choice: 1
Enter element to insert: 5
Enter priority of the inserted element: 2
Element 5 with priority 2 was successfully inserted
Enter choice: 1
Enter element to insert: 4
Enter priority of the inserted element: 2
Element 4 with priority 2 was successfully inserted
Enter choice: 1
Queue Full
Enter choice: 3
Queue Elements
Data: 5, Priority: 2
Data: 4, Priority: 2
Data: 5, Priority: 6
Data: 3, Priority: 7
Data: 9, Priority: 9

Enter choice: 2
Element 5 with priority 2 successfully deleted out of queue
Enter choice: 1
Enter element to insert: 1
Enter priority of the inserted element: 3
Element 1 with priority 3 was successfully inserted
Enter choice: 3
Queue Elements
Data: 4, Priority: 2
Data: 1, Priority: 3
Data: 5, Priority: 6
Data: 3, Priority: 7
Data: 9, Priority: 9

Enter choice: 2
Element 4 with priority 2 successfully deleted out of queue
Enter choice: 2
Element 1 with priority 3 successfully deleted out of queue
Enter choice: 2
Element 5 with priority 6 successfully deleted out of queue
Enter choice: 2
Element 3 with priority 7 successfully deleted out of queue
Enter choice: 2
Element 9 with priority 9 successfully deleted out of queue
Enter choice: 2
Queue is Empty
Enter choice: 3
Queue is Empty
Enter choice: 4
Program Terminated