import java.util.ArrayList;
public class HumanResource {
    private final ArrayList<Association> association = new ArrayList<>();

    public void add(Association entity){
        association.add(entity);

        if(entity instanceof Association){
            ((Association)entity).associate();}
    }


    public void delete(int index)
    {
        association.remove(index);
    }

    @Override
    public String toString(){
        String s="";
        for (int i=0; i<association.size(); i++){
            s+=association.get(i).toString();
            s+="\n";
        }
        return s;
    }


//    private Association[] resources;
//
//    public HumanResource()
//    {
//    }
//
//    public void add(Association p)
//    {
//        if(array == null)
//        {
//            array = new Association[1];
//            array[0] = p;
//            p.Associate();
//        }
//        else
//        {
//            extend();
//            array[array.length-1] = p;
//            p.Associate();
//        }
//    }
//
//    private void extend()
//    {
//        Association[] temp = array;
//        array = new Association[temp.length + 1];
//        for(int i = 0; i < array.length - 1; i++)
//        {
//            array[i] = temp[i];
//        }
//    }
//
//    public void delete(Association p)
//    {
//        Association[] temp =  array;
//        array = new Association[temp.length - 1];
//        for(int i = 0, j = 0; i < array.length; i++)
//        {
//            if(p.equals(temp[j]))
//            {
//                j++;
//            }
//            array[i] = temp[j];
//            j++;
//        }
//    }
//
//
//
//    @Override
//    public String toString()
//    {
//        String str="";
//        for(int i = 0; i < array.length; i++)
//        {
//            str += array[i] + "\n";
//        }
//        return str;
//    }
}



