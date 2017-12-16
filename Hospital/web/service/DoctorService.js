class DoctorService
{
    getAllDoctor()
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/GetAllDoctor', false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var doctorList= JSON.parse(request.responseText );
             return doctorList;
         }
         return null;
    }
    
    getDoctorById(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/GetDoctorById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var doctor= JSON.parse(request.responseText );
             return doctor;
         }
         return null;
    }
}