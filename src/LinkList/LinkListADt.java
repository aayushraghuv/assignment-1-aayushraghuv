package LinkList;

public interface LinkListADt<E>   {
        void add(E item);
        E remove();
        int search(E item);
        // LinkedListDefinitionClass<E> sort(LinkedListDefinitionClass<E> person);
        void print();
    }

