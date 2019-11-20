<script language="javascript">

function validate(frm){
	
	 //change vflag value to "yes" indicating client side form validations are done
	 
    frm.vflag.value="yes";
	 
	//Empty old Message....
	
	document.getElementByid("nameErr").innerHTML = "";
	document.getElementByid("ageErr").innerHTML = "";
	
	var name = frm.page.value;
	var age = frm.page.value;
	
	//Write client Side Form Validation Logic 
	
	if(name==""){
		document.getElementByid("nameErr").innerHTML="Person Name is Require";
		alert("PerSon Name Is Require");
		
		
		frm.paname.focus();
		return false;
		
	}
	
	if(age==""){
		
		document.getElementByid("ageErr").innerHTML="Person Name is Require";
		
		alert("PerSon Age Is Require");
		frm.page.focus();
		return false;
		
	}
	
	else if(isNaN(age)){
		document.getElementByid("ageErr").innerHTML="Person Name is Require";
		
		alert("Person Age Must Be Numeric ");
		frm.page.focus();
		return false;
		
	}
	
	else if(age<=0 || age>125){
		document.getElementByid("ageErr").innerHTML="Person Name is Require";
		alert("Person Age Must be there is Between 1 to 125");
		frm.page.focus();
		frm.page.focus();
		return false;
		
	}
	
	return true;
	
	}
</script>