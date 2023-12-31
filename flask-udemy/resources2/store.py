import uuid
from flask import request
from flask.views import MethodView
from flask_smorest import Blueprint, abort
from db import stores
from schemas2 import StoreSchema

blp = Blueprint("stores", __name__, description="Operations on stores")


@blp.route("/store/<string:store_id>")
class Store(MethodView):

    @blp.response(200, StoreSchema)
    def get(self, store_id):
        try:
            return stores[store_id]
        except KeyError:
            # return {"message": "Invalid store id - " + str(store_id),
            #         "status": False}, 400
            abort(400, message=f"Invalid store id - {store_id}")

    def delete(self, store_id):
        try:
            del stores[store_id]
            return {"message": "Store deleted"}, 200
        except KeyError:
            abort(400, "Invalid key mentioned")


@blp.route("/store")
class StoreList(MethodView):

    @blp.response(200, StoreSchema(many=True))
    def get(self):
        return list(stores.values())

    @blp.arguments(StoreSchema)
    @blp.response(201, StoreSchema)
    def post(self, store_data):
        # store_data = request.get_json()

        # if "name" not in store_data:
        #     abort(400,
        #           message="Bad request. Ensure 'name' is included in JSON")

        for store in stores.values():
            if store["name"] == store_data["name"]:
                abort(400, "Store already exist")

        store_id = uuid.uuid4().hex
        new_store = {**store_data, "id": store_id}
        stores[store_id] = new_store
        return stores[store_id], 201
