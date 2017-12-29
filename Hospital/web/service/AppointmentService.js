class AppointmentService
{
    getAllAppointment()
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/GetAllAppointment', false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var appointmentList= JSON.parse(request.responseText );
             return appointmentList;
         }
         return null;
    }
    
    getAppointmentById(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/GetAppointmentById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': !!!' + id + '!!! ' + request.statusText ); 
         } 
         else    {
             var appointment= JSON.parse(request.responseText );
             return appointment;
         }
         return null;
    }
    
    getAppointmentByDoctorId(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/GetAppointmentByDoctorId?doctor_id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var appointmentList= JSON.parse(request.responseText );
             return appointmentList;
         }
         return null;
    }
    
    insertAppointment(json)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/InsertAppointment?json=' + json, false);
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
    
    updateAppointment(json)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/UpdateAppointment?json=' + json, false);
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

