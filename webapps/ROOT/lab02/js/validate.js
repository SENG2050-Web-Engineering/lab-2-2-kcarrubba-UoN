function validate()
{
    var firstName = document.getElementById("firstName"); 
    var lastName = document.getElementById("lastName");

    var resultStatus = true;
    var messageStr = "The following errors were detected:\n"; 

    if (firstName == null || firstName.value.trim() === "")
    {
        resultStatus = false;
        messageStr += "First name is empty or blank\n";
    } 

    if (lastName == null || lastName.value.trim() === "")
    {
        resultStatus = false;
        messageStr += "Last name is empty or blank\n";
    }

    if (!resultStatus)
    {
        alert(messageStr);
    }

    return resultStatus;
}