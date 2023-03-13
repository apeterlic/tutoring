package dev.beenary.linked_list;

public class MyList
{
    // TODO put your code here
    protected int length;
    protected Node head;

    public MyList()
    {
        this.length = 0;
        this.head = null;
    }

    /**
     * this method adds a value to the end of the list
     *
     * @param value
     */
    public void add(int value)
    {
        Node newNode = new Node(value);

        // If the List is empty, then make the new node as head
        if (head == null)
        {
            head = newNode;
        } else
        {
            // Else iterate until the last node and insert the newNode there
            Node last = head;
            while (last.getNextNode() != null)
            {
                last = last.getNextNode();
            }

            // Insert the newNode at last node
            last.setNextNode(newNode);
        }
        length++;

    }

    public int remove(int index)
    {
        if (index >= length || index < 0)
        {
            System.out.println("Out of bound index!");
            return -1;
        }

        // Store head node
        Node currentNode = head;
        Node prevNode = null;

        int valueToReturn = 0;

        // if index is 0, return head node value
        if (index == 0)
        {
            valueToReturn = head.getValue();
            head = currentNode.getNextNode();
            length--;
            return valueToReturn;
        }


        int counter = 0;
        while (currentNode != null)
        {
            if (counter == index)
            {
                valueToReturn = currentNode.getValue();
                prevNode.setNextNode(currentNode.getNextNode());
                break;
            } else
            {
                // If current position is not the index continue to next node
                prevNode = currentNode;
                currentNode = currentNode.getNextNode();
                counter++;
            }
        }

        if (currentNode == null)
        {
            valueToReturn = 0;
        }

        length--;
        return valueToReturn;
    }

    /**
     * returns the current length of the list
     */
    public int length()
    {
        return length;
    }

    /**
     * returns the value stored at the current node index
     */
    public int get(int index)
    {
        // Store head node
        Node currNode = head;
        int valueToReturn = 0;

        if (index >= length || index < 0)
        {
            System.out.println("Out of bound index!");
            return -1;
        }

        // If index is 0, then head value is returned
        if (index == 0 && currNode != null)
        {
            return head.getValue();
        }

        // If the index is greater than 0 but less than the size of MyList
        int counter = 0;
        while (currNode != null)
        {
            if (counter == index)
            {
                valueToReturn = currNode.getValue();
                break;

            } else
            {
                currNode = currNode.getNextNode();
                counter++;
            }
        }

        if (currNode == null)
        {
            return 0;
        }

        return valueToReturn;

    }

    /**
     * outputs the contents of the list one number after another, separated by a
     * space.The last number should not have a space on the right
     */
    public String toString()
    {
        String result = "";

        Node currNode = head;

        // iterate through the list
        while (currNode != null)
        {
            result += currNode.getValue();
            currNode = currNode.getNextNode();
            if (currNode != null)
            {
                result += " ";
            }
        }

        return result;
    }
}