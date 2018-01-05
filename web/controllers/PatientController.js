class PatientController
{
    constructor()
    {
        this.patientService = new PatientService();
    }
    
    insertPatient(json)
    {
        return this.patientService.insertPatient(json);
    }
    
    insertPatientDB()
    {        
        var fio=document.getElementById("patient").value;
        var birth_date=document.getElementById("birth_date").value;
        
        var object = {};
        object.id = 0;
        object.fio = fio;
        object.birth_date = birth_date;
        
        var json=JSON.stringify(object);
        
        var count=this.insertPatient(json);
        
        //var element =document.getElementById("formAppointment");
        //element.innerHTML = count;
        
        return count;
    }
}

