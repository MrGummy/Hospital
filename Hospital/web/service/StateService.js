class StateService
{
    getStateById(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Hospital/GetStateById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var state= JSON.parse(request.responseText );
             return state;
         }
         return null;
    }
}

