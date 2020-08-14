class test{
    void mymethod (int counter)

    {

        if(counter==0)
            System.out.println(" ");
        else
        {

            System.out.println("hello"+ counter);

            mymethod (--counter);

            System.out.println(" "+counter);

        }
    }
}