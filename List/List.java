package List;

import ErrorHandling.DataStructureException;

public interface List <T> {
    public int size();
    public boolean isEmpty();
    public T get(int index) throws DataStructureException;
    public void set(int index, T element) throws DataStructureException;
    public void insert(int index, T element) throws DataStructureException;
    public void remove(int index) throws DataStructureException;
    public int find(T element) throws DataStructureException;
    public void resize(int size) throws DataStructureException;
    public void append(T element) throws DataStructureException;
}
