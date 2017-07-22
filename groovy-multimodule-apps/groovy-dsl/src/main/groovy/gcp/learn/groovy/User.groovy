package gcp.learn.groovy

import groovy.transform.Canonical


class User {
    String name
    String email

   def name(String value){
       name = value
   }

    def email(String value){
        email = value
    }

    String toString(){
        name+' '+email
    }

}
