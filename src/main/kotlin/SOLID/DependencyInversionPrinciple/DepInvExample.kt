package SOLID.DependencyInversionPrinciple
//Nos aseguramos que de llegar a cambiar la interface tenga que cambiar en todos sus proveedores
//La implementacion del login depende de la abstraccion y no de
interface AuthProvider {

    fun login(user:String, password: String)
    
}

class GoogleAuthDI(): AuthProvider {
    override fun login(user: String, password: String) {
        TODO("Not yet implemented")
    }

}


class FacebookAuthDI(): AuthProvider {
    override fun login(user: String, password: String) {
        TODO("Not yet implemented")
    }

}

class userAuthDI {

    fun auth(user:String, password: String) {
        GoogleAuth().login(user, password)
    }

}