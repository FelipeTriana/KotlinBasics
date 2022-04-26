package SOLID.DependencyInversionPrinciple

//Modulo de bajo nivel
class GoogleAuth {

    fun login(user:String, password:String){

    }

}

//Modulo de bajo nivel
class FacebookAuth {

    fun login(user:String, password:String){

    }

}

//Modulo de alto nivel
//Si cambia el orden de los parametros en la autenticacion con facebook
class userAuth {

    fun auth(user:String, password: String) {
        GoogleAuth().login(user, password)
    }

}