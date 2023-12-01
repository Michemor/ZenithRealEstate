# ZenithRealEstate
ELCOME TO ZENITH

    Enter Password

       if password = 1234
        {
            landing_page();
        }
        
       else {
        try again;
        exit    
        }
    
    landing_page(){
       s.o.p Choose the Type of house you prefer
            1.Basic House
            2.Standard House
            3.Elegant House   
        int choice = stores the choice

        switch (choice){
        case 1: create an instance of a Basic House
        case 2: create an instance of a Standard House
        case 3: create an instance of a Elegant house
        default: invalid choice
        }
    
    }

    //invoid generator method(){

    }

    Abstact class House
    {

    double l
    double w
    double base_pice = 850,000
    double base_size = 132 sq ft
    int no_of_balconies;
    int no_of_bdrooms;
    
    abstract getDimensions(l,w){}
 
    
    }

