fetch('http://localhost:8082/api/search/1')
.then(products=>{
    console.log(products.json());
})
