package java_oop_3_boxes_added_method_in_box_class;

public class box
{
    int     width;
    int     height;
    int     length;

    public void showvolume()
    {
        int volume;

        volume = width * height * length;

        System.out.println(volume);
    }
}
