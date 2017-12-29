class AppointmentController
{
    constructor()
    {
        this.appointmentService = new AppointmentService();
        this.doctorService = new DoctorService();
        this.stateService = new StateService();
        this.patientService = new PatientService();
    }
    
    // DATAController
    getAllAppointment()
    {
        return this.appointmentService.getAllAppointment();
    }
    
    getAppointmentById(id)
    {
        return this.appointmentService.getAppointmentById(id);
    }
    
    getAppointmentByDoctorId(doctor_id)
    {
        return this.appointmentService.getAppointmentByDoctorId(doctor_id);
    }
    
    getDoctorById(id)
    {
        return this.doctorService.getDoctorById(id);
    }
    
    getAllDoctor()
    {
        return this.doctorService.getAllDoctor();
    }
    
    getStateById(id)
    {
        return this.stateService.getStateById(id);
    }
    
    getAllState()
    {
        return this.stateService.getAllState();
    }
    
    getAllPatient()
    {
        return this.patientService.getAllPatient();
    }
    
    insertAppointment(json)
    {
        return this.appointmentService.insertAppointment(json);
    }
    
    updateAppointment(json)
    {
        return this.appointmentService.updateAppointment(json);
    }
    
    dateParse(date)
    {
        var newDate = new Date(date);           
        var options = {
                year: 'numeric',
                month: 'long',
                day: 'numeric',
                hour: 'numeric',
                minute: 'numeric'
              };
        newDate = newDate.toLocaleString("en", options);
        
        return newDate;
    }
    
    //ViewController
    getAllAppointmentView()
    {
        var data=this.getAllAppointment();
        var result="";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var patient_id=data[i].patient_id;
            var doctor_id=data[i].doctor_id;            
            var date = this.dateParse(data[i].date);            
            var state_id=data[i].state_id;
            var doctor=this.getDoctorById(doctor_id);
            var state=this.getStateById(state_id);
            
            var color = "#31708f";
            if (state.id === 2){color="#ff7400";}
            if (state.id === 3){color="#b9121b";}
            if (state.id === 4){color="#269926";}
            
            result += "<div class='col-lg-12 col-lg-offset-0'>"+
                        "<li class='list-group-item list-group-item-info'>"+
                          "<div class='list-group-item-addon' style='background-color: " + color + "; border: 1px solid " + color + ";'>"+
                            "<span class='glyphicon glyphicon-envelope'></span>"+
                          "</div>"+
                          "<div class='list-group-item-content'>"+
                            "<h4 class='list-group-item-heading'>" + doctor.fio + "</h4>"+
                            "<p class='list-group-item-text'>" + date + "</p>"+
                          "</div>"+
                          "<div class='list-group-item-controls'>"+
                            "<span class='label' style='background-color: " + color + ";'>" + state.name + "</span>"+
                          "</div>"+
                        "</li>"+
                      "</div>";
        }
        
        var element =document.getElementById("appointment");
        element.innerHTML = result;
    }
    
    getAppointmentByDoctorIdView(doctor_id)
    {
        
        var data=this.getAppointmentByDoctorId(doctor_id);        
        var result="";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var patient_id=data[i].patient_id;
            var doctor_id=data[i].doctor_id;            
            var date = this.dateParse(data[i].date);            
            var state_id=data[i].state_id;
            var doctor=this.getDoctorById(doctor_id);
            var state=this.getStateById(state_id);
            
            var color = "#31708f";
            if (state.id === 2){color="#ff7400";}
            if (state.id === 3){color="#b9121b";}
            if (state.id === 4){color="#269926";}
            
            result += "<div class='col-lg-12 col-lg-offset-0'>"+
                        "<li class='list-group-item list-group-item-info'>"+
                          "<div class='list-group-item-addon' style='background-color: " + color + "; border: 1px solid " + color + ";'>"+
                            "<span class='glyphicon glyphicon-envelope'></span>"+
                          "</div>"+
                          "<div class='list-group-item-content'>"+
                            "<h4 class='list-group-item-heading'>" + doctor.fio + "</h4>"+
                            "<p class='list-group-item-text'>" + date + "</p>"+
                          "</div>"+
                          "<div class='list-group-item-controls'>"+
                            "<span class='label' style='background-color: " + color + ";'>" + state.name + "</span>"+
                            "<div class='btn-group'>"+
                              "<a onclick='makeAppointment(" + doctor.id + ")' href='#' data-toggle='tooltip' data-placement='top' title='Add'><span class='glyphicon glyphicon-plus'></span></a>"+
                              "<a href='#' data-toggle='tooltip' data-placement='top' title='View'><span class='glyphicon glyphicon-eye-open'></span></a>"+
                              "<a onclick='getState(" + id + ")' href='' data-toggle='modal' data-target='#changeAppointment' title='Settings'><span class='glyphicon glyphicon-cog'></span></a>"+
                            "</div>"+
                          "</div>"+
                        "</li>"+
                      "</div>";
        }
        
        var element =document.getElementById("appointment");
        element.innerHTML = result;
    }
    
    getAllDoctorView(doctor_id)
    {
        var data=this.getAllDoctor();
        var result="";        
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var fio=data[i].fio;
            if (id == doctor_id)
            {
                result += "<option selected value='" + i + "'>" + fio + "</option>"
            }
            else
            {
                result += "<option value='" + i + "'>" + fio + "</option>";
            }
        }
        
        var element =document.getElementById("doctor");
        element.innerHTML = result;
    }
    
    insertAppointmentDB()
    {
        var patient=document.getElementById("patient").value;
        var birth_date=document.getElementById("birth_date").value;
        var sel=document.getElementById("doctor");
        var doctor=sel.options[sel.selectedIndex].text;
        var appointment_date=document.getElementById("appointment_date").value;
        var doctor_id=-1;
        var patient_id=-1;
        
        var data1=this.getAllPatient();
        for(var i=0; i<data1.length;i++)
        {
            if (data1[i].fio == patient)
            {
                patient_id=data1[i].id;
            }
        }
        
        var data2=this.getAllDoctor();
        for(var i=0; i<data2.length;i++)
        {
            if (data2[i].fio == doctor)
            {
                doctor_id=data2[i].id;
            }
        }
        
        var object = {};
        object.id = 0;
        object.patient_id = patient_id;
        object.doctor_id = doctor_id;
        object.date = appointment_date;
        object.state_id = 1;
        
        var json=JSON.stringify(object);
        
        var count=this.insertAppointment(json);
        
        //var element =document.getElementById("formAppointment");
        //element.innerHTML = count;
        
        return count;
    }
    
    getAllStateView(state_id)
    {        
        var data=this.getAllState();
        var result="";        
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var name=data[i].name;
            if (id == state_id)
            {
                result += "<option selected value='" + (i+1) + "'>" + name + "</option>"
            }
            else
            {
                result += "<option value='" + (i+1) + "'>" + name + "</option>";
            }
        }
        
        document.getElementById("appointment_date").value = this.dateParse(data.date);
        var element =document.getElementById("state");
        element.innerHTML = result;
    }
    
    updateAppointmentDB(id)
    {
        var data=this.getAppointmentById(id);
        var id=data.id;
        var patient_id=data.patient_id;
        var doctor_id=data.doctor_id;        
        var date=this.dateParse(data.date);
        var state_id=data.state_id;
        
        var newDate = document.getElementById("appointment_date").value;
        var newState_id = document.getElementById("state").value;
        
        if (newDate != "")
        {
            date = newDate;
        }
        if (newState_id != state_id)
        {
            state_id = newState_id;
        }
        
        var object = {};
        object.id = id;
        object.patient_id = patient_id;
        object.doctor_id = doctor_id;
        object.date = date;
        object.state_id = state_id;
        
        var json=JSON.stringify(object);
        
        var count=this.updateAppointment(json);
        
        return count;
    }
}


