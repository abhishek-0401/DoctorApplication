# Doctor Booking Application

- ## Frameworks and Language used
  - #### Spring Boot Framework
  - #### Java language
- ## Data Flow
  - ### DoctorController
     - ##### _saveDoctor( )_   
     - ##### _getDoctor( )_  
     - ##### _validateDoctor( )_    - It will validate a doctor
     - ##### _setDoctor ( )_     
     
  - ### PatientController
     - ##### _savePatient( )_   
     - ##### _setPatient( )_       
     - ##### _getPatients( )_     
    
  - ### DoctorService
     - ##### _saveDoctor( )_     
     - ##### _getDoctor( )_      
     - ##### _getDoctorById( )_  
     
   - ### PatientService
     - ##### _savePatient( )_      
     - ##### _getPatients( )_      
     - ##### _generateResponse( )_    - It will generate response in the Json format
  
    
   - ### DoctorRepository
     - ##### _findAll( )_   
     - ##### _findById( )_           
     - ##### _save( )_
    
   - ### PatientRepository
     - ##### _findAll( )_             
     - ##### _save( )_
     
- ## Database Used
  - #### H2 Console :  doctor_data
  
- ## Project Summary
  In this project we have created 2 models namely;Doctor and Patient. We have provided some endpoints and also in this section below we have given our API. Using this API we can perform the POST and  the GET Mapping operations accordingly.
  
  
  > http://localhost:8080
  
  End Points:
    - ##### /doctor    
    for creating and getting doctor
    
    - ##### /patient   
    for creating and getting patient

 
