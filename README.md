# AuthService
This is a project using Java Spring Framework
</br>
Objectives of this project is to create web services for the following: 
</br>
1) Authentication services.
</br>
2) Pluggable/externalize MySQL, LDAP and AD as identify provider for authentication
</br>
3) Policy-based Authorization services
</br>
4) OAuth services
</br>

</br>

Security Features to be implemented:
</br>
1.) OAuth2, JWT and basic authentication
</br>
2.) Authorization policy-based webservice
</br>
<h4>Testing the application</h4>
<lu>
<li>clone this project</li>
<li>mvn package</li>
<li>java -jar target/authservice.0.0.1-SNAPSHOT.jar</li>
<li>Verify available endpoints at localhost:8110</li>
</lu>

```javascript
{
  "_embedded" : {
    "identity_providers" : [ ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8110/identity_providers"
    },
    "profile" : {
      "href" : "http://localhost:8110/profile/identity_providers"
    }
  }
}
```


