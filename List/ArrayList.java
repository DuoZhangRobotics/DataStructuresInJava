package List;

import ErrorHandling.DataStructureException;

public class ArrayList<T> implements List<T>{
    private T[] _array; 
    private int _size;
    private int _capacity;

    public ArrayList(){
        _size = 0;
        _capacity = 10;
        _array = (T[]) new Object[_capacity];
    }

    public ArrayList(int capacity){
        _size = 0;
        _capacity = capacity;
        _array = (T[]) new Object[_capacity];
    }

    public ArrayList(T[] array){
        _size = array.length;
        _capacity = array.length;
        _array = array;
    }

    public ArrayList(ArrayList<T> arrayList) throws DataStructureException{
        _size = arrayList.size();
        _capacity = arrayList.size();
        _array = (T[]) new Object[_capacity];
        for(int i = 0; i < _size; i++){
            _array[i] = arrayList.get(i);
        }
    }

    @Override
    public int size(){
        return _size;
    }

    @Override
    public boolean isEmpty(){
        return _size == 0;
    }

    @Override
    public T get(int index) throws DataStructureException{
        if(index < 0 || index >= _size){
            throw new DataStructureException("Index out of bounds");
        }
        return _array[index];
    }

    @Override
    public void set(int index, T element) throws DataStructureException{
        if(index < 0 || index >= _size){
            throw new DataStructureException("Index out of bounds");
        }
        _array[index] = element;
    }

    @Override
    public void insert(int index, T element) throws DataStructureException{
        if(index < 0 || index > _size){
            throw new DataStructureException("Index out of bounds");
        }
        if(_size == _capacity){
            resize(_capacity * 2);
        }
        for(int i = _size; i > index; i--){
            _array[i] = _array[i - 1];
        }
        _array[index] = element;
        _size++;
    }

    @Override
    public void resize(int size) throws DataStructureException{
        if(size < _size){
            throw new DataStructureException("New size is smaller than current size");
        }
        T[] newArray = (T[]) new Object[size];
        for(int i = 0; i < _size; i++){
            newArray[i] = _array[i];
        }
        _array = newArray;
        _capacity = size;
    }

    @Override
    public void remove(int index) throws DataStructureException{
        if(index < 0 || index >= _size){
            throw new DataStructureException("Index out of bounds");
        }

        for(int i = index; i < _size - 1; i++){
            _array[i] = _array[i + 1];
        }
        _size--;
        if(_size < _capacity / 4){
            resize(_capacity / 2);
        }
    }

    @Override 
    public int find(T element) throws DataStructureException{
        for(int i = 0; i < _size; i++){
            if(_array[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void append(T element) throws DataStructureException{
        if(_size == _capacity){
            resize(_capacity * 2);
        }
        _array[_size] = element;
        _size++;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < _size; i++){
            sb.append(_array[i]);
            if(i < _size - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void extend(List<T> list) throws DataStructureException{
        throw DataStructureException.FUNCTION_NOT_IMPLEMENTED();
    }
}
