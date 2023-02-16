package task1;

import java.util.Iterator;

public class DequeueLinkedList implements Dequeue, Iterable<Integer> {
    protected Node first;
    protected Node last;

    @Override
    public void equeueFirst(final int value) {
        final Node ourFirstNode = this.first;
        final Node ourNewNode = new Node(value, first, null);
        first = ourNewNode;
        if (ourFirstNode == null) {
            last = ourNewNode;
        } else {
            ourFirstNode.setPrev(ourNewNode);
        }
    }

    @Override
    public void equeueLast(final int value) {
        final Node ourLastNode = this.last;
        final Node ourNewNode = new Node(value, null, last);
        last = ourNewNode;
        if (ourLastNode == null) {
            first = ourNewNode;
        } else {
            ourLastNode.setNext(ourNewNode);
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new DequeueLinkedListIterator();
    }

    private class DequeueLinkedListIterator implements Iterator<Integer> {
        Node nextNode = first;

        @Override
        public boolean hasNext() {
            return nextNode != null;
        }

        @Override
        public Integer next() {
            final Node value = nextNode;
            nextNode = nextNode.getNext();
            return value.getInfo();
        }
    }
}

