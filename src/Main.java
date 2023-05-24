public class Main
{
    public static int[] greaterThan(int[] values, int threshold){
        int count = 0;
        for(int i=0; i<values.length; i++){
            if(values[i]>threshold){//everytime we see an element in values greater than threshold
                count++; //we increment on count
            }
        }
        
        int newintarray[] = new int[count]; //we create an array with the size of count
       
        for(int j=0; j<newintarray.length; j++){
            for(int k=0; k<values.length; k++){
                if(values[k]>threshold){//once we identify the values greater than the threshold
                    newintarray[j]=values[k]; //we add them to our array
                    j = j + 1; //and increment on the value of j
                }
            }
        }
        
        for(int m=0; m<newintarray.length; m++){
            System.out.print(newintarray[m]); //printing our array
        }
        
        return newintarray; 
    }
    
    
    
    public static int[] getOdds(int[] values){
        int count = 0;
        for(int i=0; i<values.length; i++){
            if((values[i] % 2) != 0){ //everytime we spot an element in values where the remainder is not equal to 0
            count++; //we increment the value of count
            }
        }
        
        int newintarray2[] = new int[count]; //we create a new array of the size, count
        
        for(int j=0; j<newintarray2.length; j++){
            for(int k=0; k<values.length; k++){
                if((values[k] % 2) != 0){
                    newintarray2[j]=values[k]; //we add the elements in values[] that are odd to our new array
                    j = j + 1; //and proceed to increment on j
                }
            }
        }
        
        for(int m=0; m<newintarray2.length; m++){
            System.out.print(newintarray2[m]); //printing the new array
        }
        
        return newintarray2; 
    }
    
    
    public static int search(int[] values, int key){
        for(int i=0; i<values.length; i++){ //we search through the array values
            if(values[i]==key){ //if there are/is any element(s) that correspond to the key
                System.out.println(i); //print the index (optional)
                return i; //return the index of that element
            }
        }
        return -1; //otherwise return -1
    }
    
    public static int[] sort(int[] values){
        int temp;
        for(int i=0; i<values.length-1; i++) {
            for(int j=i+1; j<values.length; j++) {
                if(values[i] > values[j]) { //if the value of i (the preceding element) is greater than the value of j
                    temp = values[i]; //we set the position of temp to the current value of i
                    values[i] = values[j]; //then we insert the value of i onto the value of j
                    values[j] = temp; //and the value of j takes on the initial position of the value of i
                }
            }
        }
        for(int i=0; i<values.length; i++){
            System.out.print(values[i] + ", "); //printing out the new array (optional)
        }
        
        return values; 
    }   
    
    
    
    public static double median(int[] values){
    sort(values); //if the array isn't already sorted, we need to sort it to find the median
    double median = 0;
    
    if(values.length % 2 == 0){ //if the length of the array is even
        for(int i=0; i<values.length; i++){
            
            if(i+1==values.length/2){ //identifying the index of the element that is in the center of the array
                
                if(((values[i] + values[i+1])/2) % 2 != 0){ //case 1: if the sum of i and i + 2 divided by 2 isn't equal to 0
                    median = ((values[i] + values[i+1])/2) + 0.5; //we add 0.5 (due to how rounding works in java)
                    System.out.println(values[i]); 
                    System.out.println(median); 
                    return median;
                }
                else{ //case 2: if the sum of i and i + 2 divided by 2 is equal to 0
                    median = ((values[i] + values[i+1])/2);
                    System.out.println(values[i]);
                    System.out.println(median);
                    return median;
                }
                
            }
        }
    }
    else if(values.length % 2 != 0){ //if the length of the array is odd
        for(int i=0; i<values.length; i++){
            if(i+1==(values.length/2)){
                median = values[i+1];
                System.out.println(median);
                return median;
            }
        }
      }
      return median;
    }
    
    
    
    public static int[] common(int[] a, int[] b){//should be of int[] type
        int count = 0;
        int count2 = 0;
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    count++; //counting the number of elements that a and b have in common
                }
            }
        }
        
        
        int newintarray[] = new int[count]; //create a new array of the size count (number of common elements)
        
        for(int i=0; i<newintarray.length; i++){
            for(int j=0; j<a.length; j++){
                for(int k=0; k<b.length; k++){
                    if(a[j]==b[k]){
                        newintarray[i]=a[j];
                        i = i + 1; //filling in the array with the common elements then incrementing on i
                    }
                }
            }
        }
        
        //System.out.println("this is the newintarray which collects the common numbers");
        
        for(int i=0; i<newintarray.length; i++){ //printing the array so far
            System.out.print(newintarray[i] + ", ");
        }
        
  
        for(int i=0; i<newintarray.length; i++){ //i is index of the current element
            for(int j=i+1; j<newintarray.length; j++){ //j is the index of the elements that follow i
                if(newintarray[i]==newintarray[j]){ //if the current and the upcoming elements correspond
                    count2++; 
                    i = i + 1; //we increment count (i.e count the number of duplicates) and i
            }
          }
        }
        count2++;
        
        //System.out.println(count - count2);
        //System.out.println("count: " + count); //all elements in common
        //System.out.println("count2: " + count2); //only the duplicates in array2
        
        StringBuilder sb = new StringBuilder(); //we create a stringbuilder
        
        String[] newintarray12 = new String[count]; //converting newintarray12 into a string array
        
        for(int i=0; i<newintarray.length; i++) {
            newintarray12[i] = String.valueOf(newintarray[i]); //putting elements of newintarray onto its string counterpart
        }
        
        
      for(int i=0; i<newintarray12.length; i++){
          if(sb.toString().contains(newintarray12[i])){
              i = i + 1;
          }
          else{
              sb.append(newintarray12[i]);
          }
      } //we add elements from newintarray12 into sb unless it is already found (to prevent duplicates)
        
     
     int[] finalarray = new int[sb.length()]; //we create an int array
     
     for(int i=0; i<sb.length(); i++){
        finalarray[i] = Character.getNumericValue(sb.charAt(i));
     } //converting our stringbuilder into an int array
     
    return finalarray; //we return our array

    }

}
