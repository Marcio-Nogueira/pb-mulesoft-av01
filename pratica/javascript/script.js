const coins = {
    fifty: 0,
    twentyFive: 0,
    ten: 0,
    five: 0,
    one: 0,
    total: 0
}

function calculateCoins() {
    const input = document.getElementById('input');
    let value = parseFloat(input.value);
    let calc = calculateFiftyCentCoins(value);
    value = calc[0];
    coins.fifty = calc[1];
    calc = calculateTwentyFiveCentCoins(value);
    value = +(calc[0].toFixed(2));
    coins.twentyFive = calc[1];
    calc = calculateTenCentCoins(value);
    value = +(calc[0].toFixed(2));
    coins.ten = calc[1];
    calc = calculateFiveCentCoins(value);
    coins.one = Math.ceil(calc[0] * 100);
    coins.five = calc[1];
    coins.total = coins.fifty + coins.twentyFive + coins.ten + coins.five + coins.one;
    print();
}

function calculateFiftyCentCoins(value) {
    let fiftyCentCoins = 0;
    if (value >= 0.5) {
        fiftyCentCoins = parseInt(value / 0.5);
        value -= fiftyCentCoins * 0.5;
    }
    return [value, fiftyCentCoins];
}

function calculateTwentyFiveCentCoins(value) {
    let twentyFiveCentCoins = 0;
    if (value >= 0.25) {
        twentyFiveCentCoins = parseInt(value / 0.25);
        value -= twentyFiveCentCoins * 0.25;
    }
    return [value, twentyFiveCentCoins];
}

function calculateTenCentCoins(value) {
    let tenCentCoins = 0;
    if (value >= 0.10) {
        tenCentCoins = parseInt(value / 0.1);
        value -= tenCentCoins * 0.1;
    }
    return [value, tenCentCoins];
}

function calculateFiveCentCoins(value) {
    let fiveCentCoins = 0;
    if (value >= 0.05) {
        fiveCentCoins = parseInt(value / 0.05);
        value -= fiveCentCoins * 0.05;
    }
    return [value, fiveCentCoins];
}

function print() {
    const showResults = document.getElementById('resultContainer');
    showResults.innerHTML = `<p>Total de moedas: ${coins.total}</p>
                            <p>Sendo:</p>
                            <p>${coins.fifty} de 50 centavos</p>
                            <p>${coins.twentyFive} de 25 centavos</p>
                            <p>${coins.ten} de 10 centavos</p>
                            <p>${coins.five} de 5 centavos</p>
                            <p>${coins.one} de 1 centavo</p>`
}