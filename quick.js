var arr = [
  40, 504, 2, 15, 59, -74, 85, 67, 56, 29, -68, 34, 5, 6, 6, 70, 8, 9, 9, 10,
  80, 30, 9, 70,
];

console.log(arr.length);

const quick = (min, max) => {
  if (min < max) {
    let index = partition(min, max);

    console.log("\n");
    console.log("index " + index);
    console.log(min);
    console.log(index - 1);
    console.log(index + 1);

    quick(min, index - 1);
    quick(index + 1, max);
  }
};

const partition = (min, max) => {
  let pivote = arr[max];
  let index = min;

  for (let i = min; i < max; i++) {
    if (arr[i] <= pivote) {
      swap(index, i);
      index++;
    }
  }

  swap(index, max);

  return index;
};

const swap = (a, b) => {
  //   console.log(a, b);

  let bkup = arr[a];
  arr[a] = arr[b];
  arr[b] = bkup;

  console.log(JSON.stringify(arr));
};

quick(0, arr.length - 1);

//   console.log(JSON.stringify(arr));
