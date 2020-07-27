package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class BinarySearchTree <Key extends Comparable <Key>, Value >
{
    private Node root;
    private class Node
    {
        Key key;
        Value value;
        int counter;//number of children
        Node left;
        Node right;
        public Node(Key key, Value value)
        {
            this.key = key;
            this.value = value;
        }
    }

    public int size()
    {
        return size(root);
    }
    private int size(Node x)
    {
        if( x == null)
            return 0;
        return x.counter;
    }

    //put value connected with special key
    public void put(Key key, Value value)
    {
        root = put(root, key, value);
    }
    private Node put(Node x, Key key, Value value)
    {
        if(x == null)
            return new Node(key, value);
        int cmp = key.compareTo(x.key);
        if( cmp < 0 )
            x.left = put(x.left, key, value);
        else if ( cmp > 0 )
            x.right = put(x.right, key, value );
        else
            x.value = value;
        return x;
    }

    public Value get(Key key)
    {
        Node x = root;
        while ( x != null)
        {
            int cmp = key.compareTo(x.key);
            if( cmp < 0 )
                x = x.left;
            else if ( cmp > 0)
                x = x.right;
            else
                return x.value;
        }
        return null;
    }

    public Key floor(Key key)
    {
        Node x = floor(root, key);
        if(x == null)
            return null;
        return x.key;
    }
    private Node floor(Node x, Key key)
    {
        if( x == null )
            return null;
        int cmp = key.compareTo(x.key);
        if(cmp == 0)
            return x;
        if(cmp < 0)
            return floor(x.left, key);
        Node t  = floor (x.right, key);
        if(t != null)
            return t;
        else
            return x;
    }

    public int rank (Key key)
    {
        return rank(key, root);
    }
    private int rank (Key key, Node x)
    {
        if(x == null)
            return 0;
        int cmp = key.compareTo(x.key);
        if(cmp < 0)
            return rank (key, x.left);
        else if ( cmp > 0)
            return 1+size(x.left)+rank(key, x.right);
        else
            return size(x.left);
    }

    public Iterable <Key> keys()
    {
        Queue <Key> q = new Queue<Key>()
        {
            @Override
            public boolean add(Key key) {
                return false;
            }

            @Override
            public boolean offer(Key key) {
                return false;
            }

            @Override
            public Key remove() {
                return null;
            }

            @Override
            public Key poll() {
                return null;
            }

            @Override
            public Key element() {
                return null;
            }

            @Override
            public Key peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Key> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Key> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        inorder(root, q);
        return q;
    }
    private void inorder(Node x, Queue<Key> q)
    {
        if(x == null)
            return;
        inorder(x.left, q);
        q.add(x.key);
        inorder(x.right, q);
    }

    public void deleteMin()
    {
        root = deleteMin(root);
    }
    private Node deleteMin (Node x)
    {
        if( x.left == null )
            return x.right;
        x.left = deleteMin(x.left);
        x.counter = 1 + size(x.left) + size( x.right );
        return x;
    }

    public void min()
    {
        root = min(root);
    }
    private Node min (Node x)
    {
        if( x.left == null )
            return x.right;
        x.left = min(x.left);
        return x;
    }
    
    public void delete(Key key)
    {
        root = delete(root, key);
    }
    private Node delete( Node x, Key key)
    {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if( cmp < 0)
            x.left = delete(x.left, key);
        else if ( cmp > 0)
            x.right = delete(x.right, key);
        else
        {
            if( x.right == null )
                return x.left;
            if(x.left == null)
                return x.right;
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.counter = size(x.left) + size(x.right) + 1;
        return x;
    }
}
