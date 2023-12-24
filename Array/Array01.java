public class Array01 {
    public static void main(String[] args) {
        // Array is a type of data structure list of elements of same type placed in a
        // contiguous memory location.
        String[] arr = new String[5];
        arr[0] = "Akash";
        arr[1] = "sagar";
        arr[2] = "Mangal";
        arr[3] = "Urmila";
        arr[4] = "Radhakishan";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        arraymethod(arr);
    }

    // Here i am creating the method and i will pass valus into it through main method.
    static void arraymethod(String []arr){
        for (int i = 0; i < arr.length; i++) {
            String result = arr[i]+ " Holambe"; 
            System.out.println(result);
        }
         
    }
}