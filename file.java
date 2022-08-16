class kajela{
    public static void main(String[] args){
        String myName = "kajela ";
    
        String sentenceOne = String.format("Hi, my name is %s. Nice to meet you", myName);
        String myLove = String.format("the way i love %d program.", 2);
        String name = String.format("my name starts with %c", 'T');
        String myFloat = String.format("my float number is %f", 3.14);
        String hob = "hobbies";
        String lik = "likes";
        String both = String.format("my %s are much close to my %s", hob, lik);
        System.out.println(myName);
        System.out.println(sentenceOne);
        System.out.println(myLove);
        System.out.println(name);
        System.out.println(myFloat);
        System.out.println(both);
    }
}