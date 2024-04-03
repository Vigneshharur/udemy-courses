import MainNavigation from "./MainNavigation";

export default function Error() {
  return (
    <>
      <MainNavigation />
      <main>
        <h1>An error occurred</h1>
        <p>Could not find this page!</p>
      </main>
    </>
  );
}
