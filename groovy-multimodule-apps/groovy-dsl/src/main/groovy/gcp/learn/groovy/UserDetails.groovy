package gcp.learn.groovy

abstract class UserDetails extends Script{

    def user (Closure closure){
        println('run closure')
        User u = new User()
        closure.delegate = u
        closure()

        println(u.toString())
    }
}
