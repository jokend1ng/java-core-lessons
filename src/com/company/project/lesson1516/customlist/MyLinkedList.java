package com.company.project.lesson1516.customlist;

// двунапрвленный или однонаправленный связный список
public class MyLinkedList<T> {
    // размер списка (увеличивается при добавлении, уменьшается при удалении)

    private int size;
    // ссылка на первый элемент списка
    private MyLinkedListNode<T> first;
    // ссылка на последний элемент списка
    private MyLinkedListNode<T> last;

    // добавление элемента в список
    public void add(T t) {

        if (size == 0) {
            first = new MyLinkedListNode<T>(null, t, null);
            last = first;
        } else {
            MyLinkedListNode<T> node1 = last;
            last = new MyLinkedListNode<T>(node1, t, null);
            node1.setNextNode(last);

        }
        size++;
    }

    // добавление элемента в список на указанную позицию
    // индексы начинаются с 0 и не могут быть больше или равными size
    public void add(T t, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(t);

            return;
        }
        var nodeNext = (MyLinkedListNode<T>) get(index);
        var nodePrev = nodeNext.getPreviousNode();
        var newNode = new MyLinkedListNode(nodePrev, t, nodeNext);
        nodeNext.setPreviousNode(newNode);
        if (nodePrev != null) {
            nodePrev.setNextNode(newNode);
        } else {
            first = newNode;

        }
        size++;
    }

    // удаление элемента из списка (для установки соответствия использовать метод equals)
    // возвращает true, если элемент был удалён и false, если нет
    public boolean remove(T t) {
        MyLinkedListNode<T> node = first;
        if (node.getValue().equals(t)) {
            remove(0);
            return true;
        } else if (last.getValue().equals(t)) {
            remove(size);
            return true;
        } else {
            for (int i = 0; i < size - 1; i++) {
                if (node.getNextNode().getValue().equals(t)) {
                    remove(i + 1);
                    return true;
                }
                node = node.getNextNode();
            }
        }
        return false;
    }

    // удаление элемента из списка по индексу
    // возвращает удалённый, если он был удалён и null, если нет
    public T remove(int index) {
        MyLinkedListNode<T> node = (MyLinkedListNode<T>) get(index);
        var nodeNext = node.getNextNode();
        var nodePrev = node.getPreviousNode();
        if (nodeNext != null) {
            nodeNext.setPreviousNode(nodePrev);
        } else {
            last = nodePrev;
        }
        if (nodePrev != null) {
            nodePrev.setNextNode(nodeNext);
        } else {
            first = nodeNext;
        }
        size--;
        return (T) node;
    }


    // получение элемента списка по индексу (без удаления)
    // возвращает ссылку на элемент, если он найден и null, если нет
    public T get(int index) {
        MyLinkedListNode<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
        }
        return (T) node;
    }

    // метод, позволяющий развернуть список
    // необходимо перезаписать все ссылки, а не просто поменять местами first и last
    public void reverse() {
        MyLinkedListNode<T> node = last;


        for (int i = size ; i > 0; i--) {
         if (node.getNextNode()==null){
            MyLinkedListNode<T>next =node.getPreviousNode();
            node.setPreviousNode(null);
            node.setNextNode(next);
            first =node;

         }else if(node.getPreviousNode()==null){
             MyLinkedListNode<T>prev =node.getNextNode();
             node.setNextNode(null);
             node.setPreviousNode(prev);
             last =node;
             return;

         }

         else{
             MyLinkedListNode<T>next =node.getPreviousNode();
             MyLinkedListNode<T>prev =node.getNextNode();
             node.setNextNode(next);
             node.setPreviousNode(prev);



         }
            node=node.getNextNode();

        }

    }
}

