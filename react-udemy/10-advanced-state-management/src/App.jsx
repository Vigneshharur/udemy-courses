import CartContextProviderComponent, {
  CartContext,
} from "./store/shopping-cart-context.jsx";

import Header from "./components/Header.jsx";
import Shop from "./components/Shop.jsx";
import { DUMMY_PRODUCTS } from "./dummy-products.js";
import Product from "./components/Product.jsx";

function App() {
  return (
    <CartContextProviderComponent>
      <Header />
      <Shop>
        {DUMMY_PRODUCTS.map((product) => (
          <li key={product.id}>
            <Product {...product} />
          </li>
        ))}
      </Shop>
    </CartContextProviderComponent>
  );
}

export default App;
