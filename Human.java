class Human{
  String[] sex = {"Male","Female"};

  public static void main(String[] args){
    Human human= new Human();
        human.humanSex();
    }

   public void humanSex(){
    for (String x: sex) {
        System.out.println(x);
      }     
   } 
   

     
}