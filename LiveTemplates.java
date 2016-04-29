----- Singleton(Double check style) BEGIN -----
private static volatile $className$ sInstance = null;

private $className$(){
    
}

public static $className$ getInstance(){
    //create a temp variable to improve performance for reading volatile field.
    $className$ instance = sInstance;
    if (instance == null){
        synchronized ($className$.class){
            instance = sInstance;
            //double check here
            if (instance == null){
                instance = new $className$();
                sInstance = instance;
            }
        }
    }
    return instance;
}
----- Singleton(Double check style) END -----