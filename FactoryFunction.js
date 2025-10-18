function createProduct(name, price){
    let stock = 10;
    return {
        name,
        price,
        buy(qty){
            if(qty <= stock){
                stock = stock - qty;
                console.log(`${qty} booked successfully. Remaining stock: ${stock}`);
            }
            else{
                console.log(`Insufficient stock. Only ${stock} left.`);
            }
        },
        refill(qty){
            stock = stock + qty;
            console.log(`Stock refilled. New Stock ${stock}`);
        },
    };
}

let iphone = createProduct("iphone", 70000);
iphone.buy(3);
iphone.refill(5);