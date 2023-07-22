class Node(var data: Int, var next: Node? = null)

class SinglyLinkedList {

    private var head: Node? = null

    fun append(data: Int) : Node {
        val newNode = Node(data)
        if(head == null) {
            head = newNode
            return head as Node
        }

        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }

        temp?.next = newNode

        return head as Node
    }

    fun print() {
        var temp = head
        while(temp != null) {
            print("${temp.data} ")
            temp = temp.next
        }
    }

    fun print(head: Node?) {
        var temp = head
        while(temp != null) {
            print("${temp.data} ")
            temp = temp.next
        }
    }
}

fun main() {
    val node1 = Node(1)
    val node2 = Node(2)
    val node3 = Node(3)
    val node4 = Node(4)

    node1.next = node2
    node2.next = node3
    node3.next = node4

    val list = SinglyLinkedList()
    list.print(node1)

    val singlyLinkedList = SinglyLinkedList()
    singlyLinkedList.append(10)
    singlyLinkedList.append(20)
    singlyLinkedList.append(30)
    singlyLinkedList.append(40)
    singlyLinkedList.append(50)

    println()
    singlyLinkedList.print()
}