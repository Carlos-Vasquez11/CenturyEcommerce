export interface BaseProduct {
  id: number;
  name: string;
  description: string;
  price: number;
  manufacturingTime: number;
  personalizationAreas: PersonalizationArea[]
}

export interface Personalization{
  id: number;
  productId: number;
  personalizationAreaId: number;
  text: string;
  imageUrl: string;
  name: string;
  price: number;
}

export interface PersonalizationArea{
  id: number;
  baseProductId: number;
  place: string;
}

export interface Product{
  id: number;
  baseProductId: number;
  photoUrl: string;
  baseProduct: BaseProduct;
  personalizations: Personalization[];
}

export interface Publication{
  id: number;
  shopId: number;
  productId: number;
  active: boolean;
  quantity: number;
  product: Product;
}

export interface Item{
  id: number;
  quantity: number;
  purchaseId: number;
  productId: number;
  product: Product;
}

export interface Purchase{
  id: number;
  userId: number;
  items: Item[];
}
