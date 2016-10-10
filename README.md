# SalesForce Scala Rest Demo

An updated version of https://github.com/rajdeepd/force-rest-scala with a more complete build setup 
that uses standard dependencies. This code goes with [
Integrating With Salesforce Using Scala](https://developer.salesforce.com/blogs/developer-relations/2016/06/integrating-salesforce-using-scala.html), written By Rajdeep Dua.

Before running, set the following environment variables:

    FORCE_USERNAME
    FORCE_PASSWORD
    FORCE_LOGIN_URL
    FORCE_GRANT_SERVICE
    FORCE_CLIENT_ID
    FORCE_CLIENT_SECRET

For example: 

    export FORCE_USERNAME=fredFlintsone
    export FORCE_PASSWORD=yabbadabbadoo
    export FORCE_LOGIN_URL=https://whatever.com
    export FORCE_GRANT_SERVICE=something
    export FORCE_CLIENT_ID=fred
    export FORCE_CLIENT_SECRET=123secret
    sbt run
    
Output is:
    
    Multiple main classes detected, select one to run:
    
     [1] AccountList
     [2] CreateAccount
     [3] DeleteAccount
     [4] ExecuteSOQLQuery
     [5] JsonParserGson
     [6] ListApiServices
     [7] UpdateAccount
    Enter number: 
