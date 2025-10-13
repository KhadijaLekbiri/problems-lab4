package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int cur_num, cur_size;

    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.cur_size = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        this.cur_num = this.cur_size;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){
        int[] new_list = new int[this.cur_size*2]; //create a temporary list that will have double the size of the original list
        for (int i=0; i<this.cur_size; i++)
            new_list[i] = this.list[i]; //we copy the elements from list to new_list
        this.list = new_list; //change the attribute list to be the new_list
        this.cur_size *= 2; //we double the size, while the number of elements is the same
    }

    public void addElement(int newVal){
        if (this.cur_num == this.cur_size){ // if cur_num == cur_size, it means that the list is full
            this.increaseSize();
        }
        this.list[cur_num] = newVal;
        this.cur_num++; //the number of elements is increased
    }

    public void removeFirst(int newVal){
        for (int i=0; i<this.cur_num; i++){
            if (newVal == this.list[i]){
                for (int j=i; j<this.cur_num-1; j++){
                    this.list[j] = this.list[j+1]; //shifting left the values starting form index i of the removed value
                }
                this.list[this.cur_num-1] = 0; //the last element should be changed zero to not have duplicate numbers that were not in the original list
                this.cur_num--;
                break; // we break since we already find the first occurrence
            }
        }
    }

    public void removeAll(int newVal){
        for (int i=0; i<this.cur_num; i++){ // the loop will go over all the occurrences of the value
            if (newVal == this.list[i]){
                for (int j=i; j<this.cur_num-1; j++){
                    this.list[j] = this.list[j+1];
                }
                this.list[this.cur_num-1] = 0;
                this.cur_num--; //each time we decrease the number of elements
            }
        }
    }

}