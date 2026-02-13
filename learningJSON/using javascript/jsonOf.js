console.log("this is the json operation");
const json=`{
  "name":"karun",
  "age":19,
  "phone":9815941083,
  "address":{
    "city":"kathamandu",
    "municipality":"boudha",
    "ward":7
  }
}`
const user=JSON.parse(json)
user.name;

