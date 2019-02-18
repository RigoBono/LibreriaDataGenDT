package com.company.DataGeneration;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListaGeneration implements List<Integer> {

    Integer[] data=new Integer[1];
    Integer size=0;

    @Override
    public int size() {
        return size;
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
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    public String toString(){
        String rt="[";
        for(Integer element:data){
            rt+=element+",";
        }
        return rt.substring(0,rt.length()-1)+"]";
    }

    @Override
    public boolean add(Integer integer) {
        if(size==0){
            data[0]=integer;
            size++;
        }else{
            Integer[] nuevoArray=new Integer[size+1];
            for(int i=0;i<data.length;i++){
                nuevoArray[i]=data[i];
            }
            //System.out.println("size al momento:-> "+size);
            nuevoArray[size]=integer;
            data=nuevoArray;
            size++;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer get(int index) {
        
        return data[index];
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {

        for(int i=index;i<size;i++){
            try{
                data[i]=data[i+1];
            }catch (IndexOutOfBoundsException iofe){
                data[i]=data[i];
                break;
            }
        }
        size--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }
}
