package java_oop_3_boxes_added_method_in_box_class;

public class main_file
{
    public static void main (String[] args)
    {
        box mybox1;
        box mybox2;
        box mybox3;

        mybox1  = new box();
        mybox2  = new box();
        mybox3  = new box();

            mybox1.length   = 10;
            mybox1.height   = 20;
            mybox1.width    = 50;

            mybox2.height   = 55;
            mybox2.length   = 62;
            mybox2.width    = 30;

            mybox3.width    = 22;
            mybox3.length   = 12;
            mybox3.height   =  5;

                mybox1.showvolume();

                mybox2.showvolume();

                mybox3.showvolume();

    }
}
