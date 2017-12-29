class PatientService
{
    getAllPatient()
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/GetAllPatient', false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var patientList= JSON.parse(request.responseText );
             return patientList;
         }
         return null;
    }
    
    getPatientById(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/GetPatientById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var patient= JSON.parse(request.responseText );
             return patient;
         }
         return null;
    }
    
    insertPatient(json)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/InsertPatient?json=' + json, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var count= request.responseText;
             return count;
         }
         return null;
    }    
}
