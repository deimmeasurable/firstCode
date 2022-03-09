package ChapterNine;



    public class SelfArrayList {
        private boolean isEmpty = true;
        private int size;
        private String[] elements = new String[5];

        public boolean isEmpty(){
            if(size == 0)return true;
            else return false;
        }

        public void add(String item) {
            if(arrayIsFull()) resizeArray();
            elements [size++]= item;
//        isEmpty = false;
        }

        private void resizeArray() {
            String[] newArray = new String[elements.length * 2];
            for (int i = 0; i< elements.length; i++){
                newArray[i] = elements[i];
            }
            elements = newArray;
        }

        private boolean arrayIsFull() {
            return size == elements.length;

        }

        public void remove(String item) {
//        isEmpty = true;
            int indexOfItem = findIndexByItem(item);
            remove(indexOfItem);
//        size--;
        }

        private int findIndexByItem(String item) {
            for(int i = 0; i < size; i++){
                if(elements[i].equals(item)) {
                    return i;
                }
            }
            throw new IllegalArgumentException("Element does not exist");
//        return 0;
        }

        public void remove(int index) {
            elements[index] = null;
            for(int i = index; i < size; i++) {
                elements[i] = elements[i+1];
            }
            elements[size] = null;
            size--;
        }

        public int size() {
            return size;
        }

        public String get(int index) {
            return elements[index];
        }

        public int capacity() {
            return elements.length;
        }
    }
