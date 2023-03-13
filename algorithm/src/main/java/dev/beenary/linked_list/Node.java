package dev.beenary.linked_list;

public class Node
{
    // TODO put your code here
    private int value;
    private Node nextNode;

    public Node(int value)
    {
        this.value = value;
        this.nextNode = null;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public Node getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }
}
